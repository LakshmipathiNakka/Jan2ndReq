##  Product Array Exclusion

You are given an array of integers `nums`, and its size `size`. Your task is to compute a new array, `result`, such that each element at index `i` in `result` is equal to the product of all the elements in `nums` except the one at index `i`. Write a function `computeProductArray` that takes `size` and `nums` as inputs and populates the `result` array.

### Input Format:
- The first line contains an integer `size` which represents the number of elements in the array `nums`.
- The second line contains `size` space-separated integers, which represent the elements of the array `nums`.

### Output Format:
- Output a single line containing `size` space-separated integers representing the result array, where each element at index `i` in the result is the product of all elements in `nums` except `nums[i]`.



### Example 1:
**Input:**
`size = 4  `
`nums = 1 2 3 4`

**Output:**
`result = 24 12 8 6`

**Explanation:**

First element in `result`: `2×3×4=24`
Second element: `1×3×4=12`
Third element: `1×2×4=8`
Fourth element: `1×2×3=6`

### Example 2:
**Input:**
`size = 5`
`nums = -1 1 3 5 7`

**Output:**
result = `105 -105 -35 -21 -15`

**Explanation:**

First element in `result`:`1×3×5×7=105`
Second element:  `−1×3×5×7=-105`
Third element: `−1×1×5×7=-35`
Fourth element: `−1×1×3×7=-21`
Fifth element: `−1×1×3×5=-15`

### Constraints 
- The array `nums` can contain integers which are positive, negative, or zero.
- The size of the array, `size`, satisfies 1 ≤ size ≤ 10<sup>5</sup>
 