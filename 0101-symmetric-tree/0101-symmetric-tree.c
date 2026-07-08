/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


bool isSymmetric(struct TreeNode* root) {
    if(root==NULL)return true;

 bool checksame(struct TreeNode*root1,struct TreeNode *root2){
     if(root1==NULL && root2==NULL ){
        return true;
    }

    if(root1==NULL || root2==NULL ){
        return false;
    }
    else if(root1->val!=root2->val){
        return false;
    }

    return checksame(root1->left,root2->right) && checksame(root2->left,root1->right);
  }
    return checksame(root->left,root->right);
}