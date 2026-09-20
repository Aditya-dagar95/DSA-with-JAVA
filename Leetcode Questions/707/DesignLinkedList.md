class MyLinkedList {

    int val;
    MyLinkedList next;

    MyLinkedList list = null;

    public MyLinkedList() {
        val = 0;
        next = null;
    }

    public int get(int index) {

        MyLinkedList ptr = list;
        int count = 0;

        while (ptr != null) {

            if (count == index) {
                return ptr.val;
            }

            count++;
            ptr = ptr.next;
        }

        return -1;
    }

    public void addAtHead(int val) {

        MyLinkedList temp = new MyLinkedList();

        temp.val = val;
        temp.next = list;

        list = temp;
    }

    public void addAtTail(int val) {

        MyLinkedList temp = new MyLinkedList();
        temp.val = val;

        if (list == null) {
            list = temp;
            return;
        }

        MyLinkedList ptr = list;

        while (ptr.next != null) {
            ptr = ptr.next;
        }

        ptr.next = temp;
    }

    public void addAtIndex(int index, int val) {

        if (index == 0) {
            addAtHead(val);
            return;
        }

        MyLinkedList ptr = list;
        int count = 0;

        while (ptr != null && count < index - 1) {
            ptr = ptr.next;
            count++;
        }

        if (ptr == null) {
            return;
        }

        MyLinkedList temp = new MyLinkedList();
        temp.val = val;

        temp.next = ptr.next;
        ptr.next = temp;
    }

    public void deleteAtIndex(int index) {

        if (list == null) {
            return;
        }

        if (index == 0) {
            list = list.next;
            return;
        }

        MyLinkedList ptr = list;
        int count = 0;

        while (ptr.next != null && count < index - 1) {
            ptr = ptr.next;
            count++;
        }

        if (ptr.next == null) {
            return;
        }

        ptr.next = ptr.next.next;
    }
}
