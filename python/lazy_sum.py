def lazy_sum(*args):
    def sum():
        ax = 0
        for n in args:
            ax = ax + n
        return ax
    return sum
# 这个并没有调用sum
print lazy_sum(1,2,3,4)
# 调用sum
print lazy_sum(1,2,3,4)()

