# 普通的求和，区别于lazy_sum(),检测函数返回值
def calc_sum(*args):
    ax = 0
    for n in args:
        ax = ax + n
    return ax

print calc_sum(1,2,3,4)
