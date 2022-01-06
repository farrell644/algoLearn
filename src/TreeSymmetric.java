import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TreeSymmetric {
    public static boolean isSymmetric(TreeNode treeNode){
//        Queue<Integer> arrayList = (Queue<Integer>) new ArrayList<Integer>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue queue = (Queue) new ArrayList<Integer>();
        int k =1;
        int[] arr= new int[0];
        queue.add(treeNode.val);
        arr[k--] = (int) queue.poll();

        while(treeNode.left!=null&&treeNode.right!=null)
        {
            if(treeNode.left!=null){
                queue.add(treeNode.left.val);
                k++;
            }
            if(treeNode.right!=null){
                queue.add(treeNode.right.val);
                k++;
            }
            treeNode
        }
        for (int i = 0; i < k; i++) {
            arr[i] = (int)queue.poll();
        }



        return false;
    }
}
