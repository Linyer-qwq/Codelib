a=  [102,110,101,107,-125,78,109,116,-123,122,111,87,-111,115,-112,79,-115,127,99,54,108,110,-121,105,-93,111,88,115,102,86,-109,-97,105,112,56,118,113,120,111,99,-60,-126,-124,-66,-69,-51]
for i in range(0, len(a)):
    tmp = a[i] + i
    tmp ^= i
    tmp -= 2 * i
    print(tmp)
