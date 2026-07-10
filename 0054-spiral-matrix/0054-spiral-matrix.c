int* spiralOrder(int** matrix, int matrixSize, int* matrixColSize,int* returnSize)
{
    *returnSize = matrixSize * matrixColSize[0];

    int *ans = (int *)malloc((*returnSize) * sizeof(int));

    int top = 0;
    int bottom = matrixSize - 1;
    int left = 0;
    int right = matrixColSize[0] - 1;

    int a = 0;

    while (top <= bottom && left <= right)
    {
        for (int i = left; i <= right; i++)
            ans[a++] = matrix[top][i];
        top++;

        for (int i = top; i <= bottom; i++)
            ans[a++] = matrix[i][right];
        right--;

        if (top <= bottom)
        {
            for (int i = right; i >= left; i--)
                ans[a++] = matrix[bottom][i];
            bottom--;
        }

        if (left <= right)
        {
            for (int i = bottom; i >= top; i--)
                ans[a++] = matrix[i][left];
            left++;
        }
    }

    return ans;
}