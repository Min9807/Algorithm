/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 import java.util.*;

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> collect = new ArrayList<>();
        
        if(root != null){
            dfs(root, targetSum, 0, collect);
        }

        return ans;
    }

    private void dfs(TreeNode root, int targetSum, int sum, List<Integer> collect){
        // 부모 노드를 추가한다.
        collect.add(root.val);
        int total = sum + root.val;
        System.out.println(total);
        if(root.left == null && root.right == null){
            if(targetSum == total){
                ans.add(collect);
            }
        }
        else if(root.left != null && root.right == null){
            dfs(root.left, targetSum, total, cloneList(collect));
        }
        else if(root.right != null && root.left == null){
            dfs(root.right, targetSum, total, cloneList(collect));
        }
        else{
            // 왼쪽 노드 오른쪽 노드 모두 있는 경우 새로운 리스트 생성해서 이어나간다.
            if(root.left != null && root.right != null){
                dfs(root.left, targetSum, total, cloneList(collect));
                dfs(root.right, targetSum, total, cloneList(collect));
            }
        }
    }

    private List<Integer> cloneList(List<Integer> collect){
        List<Integer> list = new ArrayList<>();
        for(int num : collect){
            list.add(num);
        }
        return list;
    }
}