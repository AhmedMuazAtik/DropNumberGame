package com.mycompany.dropnumbergame;

public class AhmedMuazAtikMultiLinkedListClass<T> {

    private AhmedMuazAtikNodeClass<T> head; //Creating the head of the node.

    //This function adds new node to the head.
    void node_addition(int col, T data) {

        AhmedMuazAtikNodeClass<T> new_node = new AhmedMuazAtikNodeClass<>(data, col); //Creating new node with given data and column.

        AhmedMuazAtikNodeClass<T> temp = head;

        if (head == null) {
            head = new_node; //If theres no head, it is creating a head.
            return;
        }

        AhmedMuazAtikNodeClass<T> bottom = check_column(col);

        if (bottom != null) {

            temp = bottom;

            while (temp.up != null) {
                temp = temp.up; //Going up.
            }

            temp.up = new_node; //If theres no node above this node, it is adding the node above the latest node.
        } else {

            while (temp.right != null) {
                temp = temp.right; //Going right.
            }

            temp.right = new_node; //If theres no node next to this node, it is adding the node next to the latest node.
        }
        
        System.out.println("------------------------\nCOL NUM: " + col + "\nVALUE: " + data + "\n------------------------");

        //Merging nodes that has same datas.
        merge(col);
    }

    //This function checks for columns to add new node precisely.
    AhmedMuazAtikNodeClass check_column(int col) {

        AhmedMuazAtikNodeClass<T> temp = head;

        if (temp != null && temp.col == col) {
            return temp; //If columns are matching, returns node.
        }

        while (temp.right != null) {
            if (temp.col == col) {
                return temp; //It found the exact column.
            } else {
                temp = temp.right; //Going right.
            }
        }

        return null; //If not found, returns null.
    }

    //This function merges two nodes that both has same datas.
    void merge(int col) {

        Integer num;

        boolean isMerged = false;

        //If all same elements merged, it breaks.
        while (isMerged == false) {

            AhmedMuazAtikNodeClass<T> first_temp = check_column(col); //First controller node that below second.

            if (first_temp == null) {
                return;
            }

            if (first_temp.up == null) {
                return;
            }

            AhmedMuazAtikNodeClass<T> second_temp = first_temp.up; //Second controller node that above first.

            //If it reaches top.
            while (second_temp.up != null) {
                second_temp = second_temp.up; //Going up.
                first_temp = first_temp.up; //Going up.
            }

            //If both nodes has same datas.
            if ((int) first_temp.data == (int) second_temp.data) {
                num = (Integer) first_temp.data * 2; //Doubles the data.
                first_temp.data = (T) num; //Assigning value to the below node.
                first_temp.up = null; //Deleting above node.
                second_temp = null;
            } else {
                isMerged = true;
            }
        }
    }

    //Prints all the elements.
    void print() {

        AhmedMuazAtikNodeClass<T> temp = head;
        AhmedMuazAtikNodeClass<T> temp_head = head;
        AhmedMuazAtikNodeClass<T> t_temp = temp_head;

        AhmedMuazAtikSingleLinkedListClass<T> first_col = new AhmedMuazAtikSingleLinkedListClass<>();
        AhmedMuazAtikSingleLinkedListClass<T> second_col = new AhmedMuazAtikSingleLinkedListClass<>();
        AhmedMuazAtikSingleLinkedListClass<T> third_col = new AhmedMuazAtikSingleLinkedListClass<>();
        AhmedMuazAtikSingleLinkedListClass<T> fourth_col = new AhmedMuazAtikSingleLinkedListClass<>();
        AhmedMuazAtikSingleLinkedListClass<T> fifth_col = new AhmedMuazAtikSingleLinkedListClass<>();

        while (temp_head.right != null) {

            while (t_temp.up != null) {

                switch (t_temp.col) {
                    case 0:
                        first_col.addFirst(t_temp);
                        t_temp = t_temp.up;
                        break;
                    case 1:
                        second_col.addFirst(t_temp);
                        t_temp = t_temp.up;
                        break;
                    case 2:
                        third_col.addFirst(t_temp);
                        t_temp = t_temp.up;
                        break;
                    case 3:
                        fourth_col.addFirst(t_temp);
                        t_temp = t_temp.up;
                        break;
                    case 4:
                        fifth_col.addFirst(t_temp);
                        t_temp = t_temp.up;
                        break;
                }
            }

            switch (t_temp.col) {
                case 0:
                    first_col.addFirst(t_temp);
                    t_temp = t_temp.up;
                    break;
                case 1:
                    second_col.addFirst(t_temp);
                    t_temp = t_temp.up;
                    break;
                case 2:
                    third_col.addFirst(t_temp);
                    t_temp = t_temp.up;
                    break;
                case 3:
                    fourth_col.addFirst(t_temp);
                    t_temp = t_temp.up;
                    break;
                case 4:
                    fifth_col.addFirst(t_temp);
                    t_temp = t_temp.up;
                    break;
            }

            temp_head = temp_head.right;
            t_temp = temp_head;
        }

        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        int temp5 = 0;

        AhmedMuazAtikNodeClass<T> col1 = first_col.head;
        AhmedMuazAtikNodeClass<T> col2 = second_col.head;
        AhmedMuazAtikNodeClass<T> col3 = third_col.head;
        AhmedMuazAtikNodeClass<T> col4 = fourth_col.head;
        AhmedMuazAtikNodeClass<T> col5 = fifth_col.head;

        AhmedMuazAtikNodeClass<T> temp_col1 = first_col.head;
        AhmedMuazAtikNodeClass<T> temp_col2 = second_col.head;
        AhmedMuazAtikNodeClass<T> temp_col3 = third_col.head;
        AhmedMuazAtikNodeClass<T> temp_col4 = fourth_col.head;
        AhmedMuazAtikNodeClass<T> temp_col5 = fifth_col.head;

        if (col1 != null) {
            temp1++;

            while (col1.next != null) {
                temp1++;
                col1 = col1.next;
            }
        }

        if (col2 != null) {
            temp2++;

            while (col2.next != null) {
                temp2++;
                col2 = col2.next;
            }
        }

        if (col3 != null) {
            temp3++;

            while (col3.next != null) {
                temp3++;
                col3 = col3.next;
            }
        }

        if (col4 != null) {
            temp4++;

            while (col4.next != null) {
                temp4++;
                col4 = col4.next;
            }
        }

        if (col5 != null) {
            temp5++;

            while (col5.next != null) {
                temp5++;
                col5 = col5.next;
            }
        }

        for (int i = 0; i < 6; i++) {

            if (7 - temp1 > 0) {
                System.out.print("-\t");
                temp1++;
            } else {

                if (temp_col1.next != null) {
                    System.out.print(temp_col1.data + "\t");
                    temp_col1 = temp_col1.next;
                }
            }

            if (7 - temp2 > 0) {
                System.out.print("-\t");
                temp2++;
            } else {

                if (temp_col2.next != null) {
                    System.out.print(temp_col2.data + "\t");
                    temp_col2 = temp_col2.next;
                }
            }

            if (7 - temp3 > 0) {
                System.out.print("-\t");
                temp3++;
            } else {
                if (temp_col3.next != null) {
                    System.out.print(temp_col3.data + "\t");
                    temp_col3 = temp_col3.next;
                }
            }

            if (7 - temp4 > 0) {
                System.out.print("-\t");
                temp4++;
            } else {
                if (temp_col4.next != null) {
                    System.out.print(temp_col4.data + "\t");
                    temp_col4 = temp_col4.next;
                }
            }

            if (7 - temp5 > 0) {
                System.out.print("-\t");
                temp5++;
            } else {
                if (temp_col5.next != null) {
                    System.out.print(temp_col5.data + "\t");
                    temp_col5 = temp_col5.next;
                }
            }

            System.out.println("");
        }

        if (temp_col1 != null) {
            System.out.print(temp_col1.data + "\t");
        }

        if (temp_col2 != null) {
            System.out.print(temp_col2.data + "\t");
        }

        if (temp_col3 != null) {
            System.out.print(temp_col3.data + "\t");
        }

        if (temp_col4 != null) {
            System.out.print(temp_col4.data + "\t");
        }

        if (temp_col5 != null) {
            System.out.print(temp_col5.data + "\t");
        }

        System.out.println("");
    }
}
