package baseball.service;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberService {
    private static final int NUMBER_SIZE = 3;
    private static final int RANGE_MIN_NUMBER = 1;
    private static final int RANGE_MAX_NUMBER = 9;

    public List<Integer> convertStringToIntList(String input) {
        List<Integer> list = new ArrayList<>();
        for (char c : input.toCharArray()) {
            list.add(c - '0');
        }
        return list;
    }
    public List<Integer> generateUniqueNumberList() {
        List<Integer> uniqueNumberList = new ArrayList<>();

        while (uniqueNumberList.size() < NUMBER_SIZE) {
            uniqueNumberList.add(generateRandomNumber(uniqueNumberList));
        }
        return uniqueNumberList;
    }

    private int generateRandomNumber(List<Integer> uniqueNumberList) {
        while (true) {
            int randomNumber = Randoms.pickNumberInRange(RANGE_MIN_NUMBER,  RANGE_MAX_NUMBER);
            if (isUniqueNumber(uniqueNumberList, randomNumber)) {
                return randomNumber;
            }
        }
    }

    private boolean isUniqueNumber(List<Integer> uniqueNumberList, int randomNumber) {
        return !uniqueNumberList.contains(randomNumber);
    }
}
