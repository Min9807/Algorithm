import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, String> map = new HashMap<>();
        Map<String, Integer> minMap = new HashMap<>();
        
        for(String record : records) {
            String[] spRecord = record.split(" ");
            String number = spRecord[1];
            if(spRecord[2].equals("IN")) {
                map.put(number, spRecord[0]);
            } else {
                String[] inTime = map.get(number).split(":");
                String[] outTime = spRecord[0].split(":");
                int min = (Integer.parseInt(outTime[0]) - Integer.parseInt(inTime[0])) * 60;
                if(Integer.parseInt(outTime[1]) < Integer.parseInt(inTime[1])) {
                    min -= 60;
                    min += 60 + Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
                } else {
                    min += Integer.parseInt(outTime[1]) - Integer.parseInt(inTime[1]);
                }
                minMap.put(number, minMap.getOrDefault(number, 0) + min);
                map.remove(number);
            }
        }
        
        if(map.size() > 0) {
            for(String key : map.keySet()) {
                String[] inTime = map.get(key).split(":");
                int min = (23 - Integer.parseInt(inTime[0])) * 60;
                min += 59 - Integer.parseInt(inTime[1]);
                minMap.put(key, minMap.getOrDefault(key, 0) + min);
            }
        }
        for(String key : minMap.keySet()) {
            int fee = fees[1];
            if(minMap.get(key) > fees[0]) {
                fee += ((minMap.get(key) - fees[0]) / fees[2]) * fees[3];
            }
            if(((minMap.get(key) - fees[0]) % fees[2]) > 0) {
                fee += fees[3];
            }
            minMap.put(key, fee);
        }
        int[] answer = new int[minMap.size()];
        Car[] cars = new Car[minMap.size()];
        
        int idx = 0;
        for(String key : minMap.keySet()) {

            cars[idx++] = new Car(Integer.parseInt(key), minMap.get(key));
        }
        
        Arrays.sort(cars, (v1, v2) -> {
            return v1.number - v2.number;
        });
        
        for(int i=0; i<cars.length; i++) {
            answer[i] = cars[i].fee;
        }
        return answer;
    }
    
    public class Car {
        public int number;
        public int fee;
        
        public Car(int number, int fee) {
            this.number = number;
            this.fee = fee;
        }
    }
}