package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OccurencesCounter {

    Map<Integer, Integer> numOccurences = new HashMap<>();

    public OccurencesCounter(List<Integer> numbers) {
        insertAll(numbers);
    }

    public void insertAll(List<Integer> numbers) {
        if (numbers != null) {
            numbers.forEach(this::insert);
        }
    }

    private void insert(int key) {
        if (numOccurences.containsKey(key)) {
            incrementEntryValue(key);
        } else {
            initializeEntry(key);
        }
    }

    private void incrementEntryValue(int key) {
        if (numOccurences.containsKey(key)) {
            int oldValue = numOccurences.get(key);
            int newValue = oldValue + 1;
            numOccurences.put(key, newValue);
        }
    }

    private void initializeEntry(int key) {
        int initCount = 1;
        numOccurences.put(key, initCount);
    }

    public double getAverage() throws EmptyCollectionException {
        int count = getCount();
        if (count == 0) {
            throw new EmptyCollectionException("Undefined average");
        }

        return getSum() / count;
    }

    public double getSum() {
        double sum = 0.0;
        for (Entry<Integer, Integer> entry : numOccurences.entrySet()) {
            int value = entry.getKey();
            int numOccurences = entry.getValue();
            sum += value * numOccurences;
        }

        return sum;
    }

    public int getCount() {
        int count = 0;
        for (int numOccurences : numOccurences.values()) {
            count += numOccurences;
        }

        return count;
    }

    public int getMinNumber() throws EmptyCollectionException {
        if (numOccurences.isEmpty()) {
            throw new EmptyCollectionException("No numbers provided");
        }

        int minNumber = Integer.MAX_VALUE;
        for (int number : numOccurences.keySet()) {
            if (number < minNumber) {
                minNumber = number;
            }
        }

        return minNumber;
    }

    public int getMaxNumber() throws EmptyCollectionException {
        if (numOccurences.isEmpty()) {
            throw new EmptyCollectionException("No numbers provided");
        }

        int maxNumber = Integer.MIN_VALUE;
        for (int number : numOccurences.keySet()) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return maxNumber;
    }

    public int getNumOccurences(int number) {
        if (numOccurences.containsKey(number)) {
            return numOccurences.get(number);
        }

        return 0;
    }
}