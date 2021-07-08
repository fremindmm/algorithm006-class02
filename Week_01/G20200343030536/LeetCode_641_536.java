/**
 * @author : Hyuk
 * @description : LeetCode_641_536
 * @date : 2020/2/15 6:57 下午
 */
public class LeetCode_641_536 {

    private Entry first;
    private Entry last;
    private int cur;
    private int count;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public LeetCode_641_536(int k) {
        this.count = k;
        this.cur = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (isFull()) { return false; }
        Entry entry = new Entry(value);
        if (isEmpty()) {
            first = entry;
            last = entry;
        } else {
            first.pre = entry;
            entry.next = first;
            first = entry;
        }
        cur++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (isFull()) { return false; }
        Entry entry = new Entry(value);
        if (isEmpty()) {
            first = entry;
            last = entry;
        } else {
            entry.pre = last;
            last.next = entry;
            last = entry;
        }
        cur++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        first = first.next;
        cur--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        last = last.pre;
        cur--;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        return isEmpty() ? -1 : first.val;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        return isEmpty() ? -1 : last.val;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return cur == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return cur == count;
    }
}

class Entry {
    int val;
    Entry pre;
    Entry next;

    Entry(int val) {
        this.val = val;
    }
}
