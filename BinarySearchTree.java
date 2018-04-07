import com.sun.tools.classfile.Instruction;

public class BinarySearchTree {
    BSTNode root;

    public BinarySearchTree() {
        BSTNode root = null;

    }

    private boolean insert(int n, BSTNode ins) {
        if (ins.getValue() < n) {
            if (ins.right == null) {
                ins.right = new BSTNode(n);
                return true;
            }
            return insert(n, ins.right);
        } else {
            if (ins.left == null) {
                ins.left = new BSTNode(n);
                return true;
            }
            return insert(n, ins.left);
        }


    }

    public boolean insert(int n) {
        if (this.root != null) return insert(n, this.root);
        else {
            root = new BSTNode(n);
        }
        return true;
    }

    public BSTNode searchForValue(int n, BSTNode reference) {
        if (reference == null) {
            return null;
        }
        if (reference.getValue() < n && reference.right != null) {
            return searchForValue(n, reference.right);
        } else if (reference.getValue() > n && reference.left != null) {
            return searchForValue(n, reference.left);
        } else if (reference.getValue() == n) {
            return reference;
        }


        return null;
    }

    public void delete(int n) {
        BSTNode temporary = searchForValue(n, root);
        if (temporary == null) {
            return;
        }
        if (temporary == root) {
            if (temporary.left == null) {
                root = temporary.right;
                return;
            }
            if (temporary.right == null) {
                root = temporary.left;
                return;
            }
            BSTNode temporary2 = temporary.right;
            while (temporary2.left != null) {
                temporary2 = temporary2.left;
            }
            temporary.value = temporary2.value;
            temporary2.parent.left = temporary2.right;
            return;
        }
        if (temporary == temporary.parent.left) {
            if (temporary.left == null) {
                temporary.parent.left = temporary.right;
                return;
            }
            if (temporary.right == null) {
                temporary.parent.left = temporary.left;
                return;
            }
            BSTNode temporary2 = temporary.right;
            while (temporary2.left != null) {
                temporary2 = temporary2.left;
            }
            temporary.value = temporary2.value;
            temporary2.parent.left = temporary2.right;
            return;
        }
        if(temporary == temporary.parent.right){
            if (temporary.left == null) {
                temporary.parent.right = temporary.right;
                return;
            }
            if (temporary.right == null) {
                temporary.parent.right = temporary.left;
                return;
            }
            BSTNode temporary2 = temporary.right;
            while (temporary2.left != null) {
                temporary2 = temporary2.left;
            }
            temporary.value = temporary2.value;
            temporary2.parent.left = temporary2.right;
            return;
        }
        }


    }

