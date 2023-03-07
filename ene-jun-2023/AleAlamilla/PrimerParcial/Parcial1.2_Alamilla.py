def merg_sort(movies):
    if len(movies) <= 1:
        return movies
    else:
        mid = len(movies) // 2
        left = movies[:mid]
        righ = movies[mid:]
        left_sort = merg_sort(left)
        righ_sort = merg_sort(righ)
        return merg(left_sort, righ_sort)

def merg(list1, list2):
    new = []
    i, j = 0, 0
    while i < len(list1) and j < len(list2):
        if time(list1[i]) <= time(list2[j]):
            new.append(list1[i])
            i += 1
        else:
            new.append(list2[j])
            j += 1
    new += list1[i:]
    new += list2[j:]
    return new

def time(movie):
    hours, minutes = movie[1], movie[2]
    return hours * 60 + minutes

def main():
  print("How many movies are you going to sort?")
  n = int(input())
  print("Please Enter the movie name and lengt: ")
  movies = []
  for i in range(n):
      name, hours, minutes = input().split()
      movies.append((name, int(hours), int(minutes)))

  sorted_movies = merg_sort(movies)

  print("The movies from shortest to longest: ")
  for movie in sorted_movies:
      print(movie[0],end=" ")


if __name__ == '__main__':
    main()
