public class LList {

    Node head;
    class Node {
        String value;
        public Node next;

        Node(String v) {
                value = v;
            }
            @Override
            public String toString() {
                return "" + value;
            }
        }

        public LList(Node head){
            this.head=head;
        }

        public LList(){
        }

        public LList add(String value) {

            Node new_node = new Node(value);

            if(head==null){
                head = new_node;
            } else {

                Node last = head;
                while(last.next!=null) {
                    last=last.next;
                }
                last.next = new_node;

            }
            return this;
        }

        public String getLastElement(){

            if(head == null) return null;

            Node node = head;
            String value = node.value;
            while(node.next!=null) {
                node = node.next;
                value = node.value;
            }

            return value;
        }

        public void removeLastElement(){

            if(head==null) return;

            if(head.next==null) {
                head=null;
                return;
            }

            Node node = head;

            while (node.next.next != null) {
                node = node.next;
            }

            node.next = null;


        }

        @Override
        public String toString() {
            String result = "";
            Node element = head;

            while(element!=null) {
                result=result+" "+element.value;
                element=element. next;
            }

            return result;
        }

}
