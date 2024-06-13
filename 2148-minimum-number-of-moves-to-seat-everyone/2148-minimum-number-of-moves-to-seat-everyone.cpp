class Solution {
public:
    int minMovesToSeat(std::vector<int>& seats, std::vector<int>& students) {
        std::sort(seats.begin(), seats.end());
        std::sort(students.begin(), students.end());

        int answer = 0;
        for (int i = 0; i < seats.size(); i++) {
            answer += std::abs(seats[i] - students[i]);
        }

        return answer;
    }
};