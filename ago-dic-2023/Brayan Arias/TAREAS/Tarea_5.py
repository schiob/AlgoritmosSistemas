

def merge_sort(arr):
  if len(arr) == 1:
    return arr

  mid = len(arr) // 2

  izquierda = arr[:mid]
  derecha = arr[mid:]

  izquierda = merge_sort(izquierda)
  derecha = merge_sort(derecha)

  return merge(izquierda, derecha)

def merge(izquierda_2, derecha_2):
  resultado = []

  apuntador_iquierda = 0
  apuntador_derecha = 0

  while apuntador_iquierda < len(izquierda_2) and apuntador_derecha < len(derecha_2):
    if len(izquierda_2[apuntador_iquierda]) < len(derecha_2[apuntador_derecha]):
      resultado.append(izquierda_2[apuntador_iquierda])
      apuntador_iquierda += 1
    else:
      resultado.append(derecha_2[apuntador_derecha])
      apuntador_derecha += 1

  resultado += izquierda_2[apuntador_iquierda:]
  resultado += derecha_2[apuntador_derecha:]

  return resultado
nombres = input("Ingrese los nombres : ")
arr = nombres.split()

print(merge_sort(arr))