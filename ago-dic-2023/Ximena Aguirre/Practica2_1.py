def max_problems_to_solve(n, m, problem_times):
    # lista de problemas
    problem_times.sort()

    problems_solved = 0
    time_left = m
    for time in problem_times:
        if time <= time_left:
            problems_solved += 1
            time_left -= time
        else:
            break

    return problems_solved

# Leer la entrada
n, m = map(int, input().split())
problem_times = list(map(int, input().split()))

# Calcular la cantidad máxima de problemas que David puede resolver
problemasmax = max_problems_to_solve(n, m, problem_times)

# Imprimir el resultado
print(problemasmax)