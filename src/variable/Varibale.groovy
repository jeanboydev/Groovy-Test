package variable

int x = 10
println x.class

// 弱类型
def y = 11
def z = 3.14
def s = "android"
println y.class
println z.class
println s.class


def name = 'a single string'
println name.class
// 可以指定格式
def name1 = '''a single
哈哈
 string'''
println name1

// GString
def name2 = "hello：${name}"
println name2
println name2.class

/*--------字符串方法-------*/
def str = "groovy"
println str.center(8, "*")


/*--------流程控制-------*/
def haha = 1.23
def result
switch (haha) {
    case 'foo':
        result = 'fond foo'
        break
    case [4, 5, 6, 'iii']:
        break
    case 12..30:
        break
}

def sum = 0
for (i in 0..9) {
    sum += i
}
/*--------闭包-------*/
def closer = {
    println 'hello groovy'
}

//调用闭包
closer.call()
//closer()    println "closer3"


def closer2 = { String name3, int age ->
    println "hello ${name3}, age ${age}"
    return "返回值"
}
def result2 = closer2("java", 4)
println result2

/**
 * this: 闭包定义处的类
 * owner: 闭包处的类或者对象
 * delegate: 代表任意对象
 */
def closer3 = {
    println "closer3:" + this
    println "closer3 owner:" + owner
    println "closer3 delegate:" + delegate
}
closer3.call()

/*--------数据结构-------*/
def list = [1, 2, 3, 4, 5]
println list.class
println list.size()

def array = [1, 2, 3, 4, 5] as int[]
int[] array2 = [1, 2, 3, 4, 5]

def sortList = [1, 4, 5, 2, 3, 33, 21, 322]
//Collections.sort(sortList)
sortList.sort { a, b ->
    a == b ? 0 : Math.abs(a) < Math.abs(b) ? 1 : -1
}


/*--------范围-------*/
def rang = 1..10
println rang[0]
def rang2 = 1..<10