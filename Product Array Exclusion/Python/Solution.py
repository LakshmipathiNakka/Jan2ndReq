# fn and its implementation
def compute_product_array(size, nums, result):
    total_product = 1
    zero_count = 0

    # Compute total product and count zeros
    for num in nums:
        if num != 0:
            total_product *= num
        else:
            zero_count += 1

    # Populate the result array
    for num in nums:
        if zero_count > 1:
            result.append(0)
        elif num == 0:
            result.append(total_product)
        else:
            result.append(0 if zero_count == 1 else total_product // num)