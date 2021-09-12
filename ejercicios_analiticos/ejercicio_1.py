# Given a string sequence consisting of the characters '(', ')', '[', ']', '{', and '}'. Your task is to determine whether or not the sequence is a valid bracket sequence.

# The Valid bracket sequence is defined in the following way:

# An empty bracket sequence is a valid bracket sequence.
# If S is a valid bracket sequence then (S), [S] and {S} are also valid.
# If A and B are valid bracket sequences then AB is also valid.
# Example

# For sequence = "()", the output should be validBracketSequence(sequence) = true;
# For sequence = "()[]{}", the output should be validBracketSequence(sequence) = true;
# For sequence = "(]", the output should be validBracketSequence(sequence) = false;
# For sequence = "([)]", the output should be validBracketSequence(sequence) = false;
# For sequence = "{[]}", the output should be validBracketSequence(sequence) = true.
# Input/Output

# [execution time limit] 4 seconds (py3)

# [input] string sequence

# A bracket sequence, consisting of the characters (, ), [, ], {, and }.

# Guaranteed constraints:
# 0 ≤ sequence.length ≤ 106.

# [output] boolean

# true if sequence is a valid bracket sequence and false otherwise.


# autor : Elquin Cascavita 
#resumen: comprobar que cumpla con su secuencia 
#version python 3.7 


#--------------------------exercise--------------------------
def validBracketSequence(sequence):
  seg = list(sequence)
  count = []
  result = False
  alfa =[]
  beta = []
  deg = 1
  contador = 0
  test = ['none','{', '}', '[', ']', '(',')'];
  limit = len(test)-1
  based = len(sequence)
  # la entrada se compara con test para crear un array 
  # el cual contiene los numeros de las parejas de cada caracter

  for e in seg:
    for t,m in enumerate(test):
        if(e == m):
          count.append(t)
  print(count)

  # primero se sabe que sea un numero par, eso me indica que aunque no se sepa si cada  uno tiene su pareja 
  # se sabe que todos los caractereres tiene almenos un acompañante
  if len(count)%2 ==0:
    #segun la secuencia de test cada el numero inicial no puede ser impar
    if count[0]%2 == 0:
      result = False
     
      
    else:
      #Despues de iniciar, ahora se comapra que el numero actual y el siguiente son pareja es decir
      #1->2, 3->4, 5->6
      for a,b in enumerate(count):
        try:
          
          # condiciones generales
          val_1 = count[a+1]
          val_2 = b+1
          val_x = count[0] + 1
          val_y = count[-1]
          
          if val_1 == val_2:
            result = True
          else: 
            result = False
            #depues de realizar cada operacion existe un probabilidad de que el numero de inicio tenga pareja en el numero final 
            # del array es por eso que se debe evaluar los caracteres del medio
            if val_x == val_y: 
              result = True
              vacilar = (len(count)-1)
              # ahora se calcula cuales son las parejas y de donde a donde se tiene que mover el 
              for z in range(1,(vacilar)):
                #ahora se calcula la posicion z = 1 se debe saber si el siguiente es la posicion count + 1
                val_p = count[z+1]
                val_q = count[z] + 1
                if val_q > limit:
                  val_p = count[z-1]
                  val_q = count[z] - 1
                try:
                  if val_p == val_q:
                    
                    if based > 4:
                      if val_p == val_q:
                        result = True
                      else:
                        result = False  
                    else:
                      break
                      result = True
                  else:
                    result = False
                    


                except IndexError:
                 pass

            else:
              result = False

        
        except IndexError:
         pass

  else:
    result= False
    



  return result;

result = validBracketSequence('{}')
print(result)