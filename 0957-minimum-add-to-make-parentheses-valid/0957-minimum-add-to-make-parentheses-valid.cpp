class Solution {
public:
    int minAddToMakeValid(std::string s) {
        std::stack<char> stack;
        for (char ch : s) {
            if (ch == ')') {
                if (!stack.empty() && stack.top() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
};