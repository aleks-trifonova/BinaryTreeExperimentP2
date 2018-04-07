import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BinaryTreeExperiment {
    private ArrayList<Integer> createArray;
    private ArrayList<Integer> randomArray;
    private ArrayList<Integer> modifyArray;
    private BinarySearchTree tree;

    public BinaryTreeExperiment(BinarySearchTree tree) {
        //this is the constructor
        this.tree = tree;
        createArray = new ArrayList<Integer>();

        for (int i = 0; i < 1023; i++) {
            createArray.add(i);
        }

        randomArray = new ArrayList<Integer>();
        shuffle();

        modifyArray = new ArrayList<Integer>();


    }

    private void shuffle() {//this randomizes the array and stores randomized array into random Array
        ArrayList<Integer> temp = new ArrayList<Integer>();// create an ArrayList so i can use Collections
        for (int i = 0; i < createArray.size(); i++) {
            temp.add(createArray.get(i);// store data into arrayList
        }
        Collections.shuffle(temp);
        for (int i = 0; i < temp.size(); i++) {
            randomArray.add(temp.get(i));// stores newly shuffled data into randomArray
        }

    }

    private void balTree(ArrayList<Integer> arr) {
        //insert code for balanced tree
        int high, low, mid;
        mid = arr.size() / 2;
        high = arr.size() - 1;
        low = 0;
        tree.insert(arr.get(mid));//this inserts the mid point of the current array into the tree
        if (mid != low) {
            for (int i = low; i < mid; i++) {
                modifyArray.add(i, i);//this loads the first values into modify array and then sends it to through the method again
                balTree(modifyArray);
            }
            for (int i = mid + 1; i < high; i++) {
                modifyArray.add(0, i);//overwrites what is in modify array with the 2nd half of the "arr" values
                balTree(modifyArray);
            }
            public void deleteBalNodes {
                Random r = new Random();

                int randNode;
                for (int i = 0; i < 511; i++) {
                    randNode = r.nextInt(1022);
                    modifyArray.add(i, randNode);// in the instructions it says to re-insert some of the deleted nodes so that
                    // is why i am storing it in modify array
                    tree.delete(randNode);
                }
            }
            public void reinsertBal {
                for (int i = 0; i < 255; i++) {
                    tree.insert(modifyArray.get(i));// this inserts the deleted nodes
                }

            }
            public void deleteRandTree {
                Random r = new Random();

                int randNode;
                for (int i = 0; i < 511; i++) {
                    randNode = r.nextInt(1022);
                    modifyArray.add(i, randNode);// in the instructions it says to re-insert some of the deleted nodes so that
                    // is why i am storing it in modify array
                    tree.delete(randNode);
                }
            }
            public void reInsertRand {
                for (int i = 0; i < 255; i++) {
                    tree.insert(modifyArray.get(i));// this inserts the deleted nodes
                }
            }

        }


    }

    private void createRandTree() {
        //insert code for random tree

        for (int i = 0; i < randomArray.size(); i++) {
            tree.insert(randomArray.get(i));
        }


    }


    private void deleteRandom() {
        Random r = new Random();
        for (int i = 0; i < 511; i++) {//this deletes random values from 0-1023
            tree.delete(r.nextInt(1023));
        }

    }

    private void insertRand() {
        Random r = new Random();
        for (int i = 0; i < 255; i++) {//this inserts random values from 0-1023
            tree.insert(r.nextInt(255));

        }
    }

}
