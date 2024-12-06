#Backend code (to handle input and supply to the fn.)
from solution import compute_product_array

if __name__ == "__main__":
    size = int(input())
    nums = list(map(int, input().split()))

    # Result array to be populated
    result = []

    # Compute the result
    compute_product_array(size, nums, result)

    # Print the result
    print(" ".join(map(str, result)))
