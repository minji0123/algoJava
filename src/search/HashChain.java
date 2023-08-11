package search;
import java.util.LinkedList;
//import java.util.Map;

public class HashChain<K, V> {

    // 해시 테이블 크기 (슬롯 개수)
    private int capacity;

    // 연결 리스트를 담을 배열
    private LinkedList<search.HashChain.Entry<K, V>>[] table;

    // 해시 테이블의 각 슬롯에 저장될 Entry 클래스 정의
    private static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // 생성자: 초기 해시 테이블 크기를 받아 초기화
    public HashChain(int capacity) {
        this.capacity = capacity;
        this.table = new LinkedList[capacity];

        // 각 슬롯을 비어있는 LinkedList로 초기화
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // 해시 함수: 키의 해시 코드를 반환하는 메서드
    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // 데이터 삽입 메서드
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];

        // 이미 같은 키가 존재하는지 확인하고, 있다면 값을 갱신
        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        // 같은 키가 존재하지 않을 경우 새로운 엔트리를 추가
        chain.add(new Entry<>(key, value));
    }

    // 데이터 조회 메서드
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];

        // 해당 슬롯에 저장된 모든 엔트리를 검색하며 키를 비교
        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                return entry.value; // 키에 해당하는 값 반환
            }
        }

        return null; // 키에 해당하는 값이 없는 경우 null 반환
    }

    // 데이터 삭제 메서드
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> chain = table[index];

        // 해당 슬롯에 저장된 모든 엔트리를 검색하며 키를 비교
        for (Entry<K, V> entry : chain) {
            if (entry.key.equals(key)) {
                chain.remove(entry); // 키에 해당하는 엔트리를 삭제
                return;
            }
        }
    }

    public static void main(String[] args) {
        HashChain<String, Integer> hashTable = new HashChain<>(10);

        // 데이터 삽입
        hashTable.put("apple", 100);
        hashTable.put("banana", 200);
        hashTable.put("orange", 300);

        // 데이터 조회
        System.out.println("apple의 값: " + hashTable.get("apple")); // 출력: apple의 값: 100
        System.out.println("banana의 값: " + hashTable.get("banana")); // 출력: banana의 값: 200

        // 데이터 삭제
        hashTable.remove("orange");

        // 데이터 삭제 후 조회
        System.out.println("orange의 값: " + hashTable.get("orange")); // 출력: orange의 값: null (삭제된 데이터)
    }
}
