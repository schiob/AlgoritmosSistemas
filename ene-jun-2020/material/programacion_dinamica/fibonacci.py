from datetime import datetime

tab = [0, 1, 1]

def fib(x):
  if len(tab) > x:
    return tab[x]
  
  tab.append(fib(x-1) + fib(x-2))
  return tab[x]

def fib1(x):
  if x == 1 or x == 2:
    return 1
  
  return fib1(x-1) + fib1(x-2)


def fib_iter(x):
  anterior1 = 1
  anterior2 = 1
  for _ in range(2, x):
    new = anterior2 + anterior1
    anterior1 = anterior2
    anterior2 = new

  return anterior2

tab_iter = [0,]

def fib_iter(x):
  tab_iter.append(1)
  tab_iter.append(1)
  for i in range(len(tab_iter)-1, x):
    new = tab_iter[i-1] + tab_iter[i-2]
    tab_iter.append(new)

  return tab_iter[x]


if __name__ == "__main__":
  print(datetime.now())
  fib_iter(100000)
  print(datetime.now())