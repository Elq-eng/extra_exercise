#librerias
import math;
from tkinter import *
import tkinter as tk
from tkinter import ttk

#%%
# Suma Diagonal 
# Resumen: se hace el el diseño de la interfaz y luego la funcion que hace la suma diagonal
# Elquin Cascavia
# version python spyder 3,6
        
 #%%
    
class Diseño_Interface:
    
    
    
    #constructor
    def __init__(self,calculadora):
        super().__init__()
        #variables 
        self.operador = "";
        self.operador2 = "";
        self.operador3 = "";
        self.operador4 = "";
        self.operador5 = "";
        self.operador6 = "";
        self.operador7 = "";
        self.operador8 = "";
        self.operador9 = "";
        self.operador10 = "";
        self.operador11 = "";
        self.counter = 0;
        self.r = StringVar()
        self.text_pantalla = StringVar()
        self.text_pantalla2 = StringVar();
        self.text_pantalla3 = StringVar();
        self.text_pantalla4 = StringVar();
        self.text_pantalla5 = StringVar();
        self.text_pantalla6 = StringVar();
        self.text_pantalla7 = StringVar();
        self.text_pantalla8 = StringVar();
        self.text_pantalla9 = StringVar();
       
        self.calculadora = calculadora;
        calculadora.geometry("500x450");
        calculadora.resizable(0,0);
        calculadora.config(width=500,height=500);
        
        #botones
        
        frame =  Frame(calculadora,width=350,height=200,bg = "#898280").place(x=23,y = 245);
        butto =  Button(calculadora, text = "1", font = ("Arial",12), width = 8, 
                        command=lambda: self.Click(1,self.counter)).place(x = 50, y = 250);
        
        butto1 = Button(calculadora, text = "2", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(2,self.counter)).place(x = 150, y = 250);
        butto3 = Button(calculadora, text = "3", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(3,self.counter)).place(x = 250, y = 250);
        butto4 = Button(calculadora, text = "4", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(4,self.counter)).place(x = 50, y = 300);
        butto5 = Button(calculadora, text = "5", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(5,self.counter)).place(x = 150, y = 300);
        butto6 = Button(calculadora, text = "6", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(6,self.counter)).place(x = 250, y = 300);
        butto7 = Button(calculadora, text = "7", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(7,self.counter)).place(x = 50, y = 350);
        butto8 = Button(calculadora, text = "8", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(8,self.counter)).place(x = 150, y = 350);
        butto9 = Button(calculadora, text = "9", font = ("Arial",12), width = 8,
                        command=lambda: self.Click(9,self.counter)).place(x = 250, y = 350);
        butto9 = Button(calculadora, text = "0", font = ("Arial",12), width = 30,
                        command=lambda: self.Click(0,self.counter)).place(x = 50, y = 400);
        
#--------------------------------------------------------------------------------------------------------------       
       
        #validar que solo sean numeros
        def validate_entry(text):
            return text.isdecimal()
        
#-------------------------------------------------------------------------------------------------------------
        #cajas de texto
        
        self.Entrada1 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada1.place(x = 50, y = 10,height = 30);
        self.Entrada1.config(state=tk.NORMAL)
        #self.Entrada1 = self.Entrada1.config()
        
        self.Entrada2 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla2,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada2.place(x = 150, y = 10,height = 30);
        self.Entrada2.config(state=tk.DISABLED)
        self.Entrada3 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla3,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada3.place(x = 250, y = 10,height = 30);
        self.Entrada3.config(state=tk.DISABLED)
        self.Entrada4 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla4,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada4.place(x = 50, y = 50,height = 30);
        self.Entrada4.config(state=tk.DISABLED)
        self.Entrada5 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla5,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada5.place(x = 150, y = 50,height = 30);
        self.Entrada5.config(state=tk.DISABLED)
        self.Entrada6 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla6,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada6.place(x = 250, y = 50,height = 30);
        self.Entrada6.config(state=tk.DISABLED)
        self.Entrada7 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla7,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada7.place(x = 50, y = 90,height = 30);
        self.Entrada7.config(state=tk.DISABLED)
        self.Entrada8 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla8,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada8.place(x = 150, y = 90,height = 30);
        self.Entrada8.config(state=tk.DISABLED)
        self.Entrada9 = ttk.Entry(calculadora,width = 10,textvariable = self.text_pantalla9,
                         validate="key", validatecommand=(calculadora.register(validate_entry), "%S"))
        self.Entrada9.place(x = 250, y = 90,height = 30);
        self.Entrada9.config(state=tk.DISABLED)
        
#--------------------------------------------------------------------------------------------------------        
        def change_label_number(): 
                self.counter += 1

                if self.counter <= 8:
                    self.Next(self.counter)
                else:
                    self.counter = 0
                    print (self.counter)
                    self.Next(self.counter)
                    self.operador = "";
                    self.operador2 = "";
                    self.operador3 = "";
                    self.operador4 = "";
                    self.operador5 = "";
                    self.operador6 = "";
                    self.operador7 = "";
                    self.operador8 = "";
                    self.operador9 = "";
                    self.operador10 = "";
                    self.operador11 = "";
                            
        
        
#--------------------------------------------------------------------------------------------------
        #BOTON DE SIGUIENTE
        
        #boton de resultado
        Next = Button(calculadora, text = "Next", font = ("Arial",12), width = 10, 
                        command= change_label_number).place(x = 390, y = 100);
        
        #boton de resultado
        buttoR = Button(calculadora, text = "Enter", font = ("Arial",12), width = 10, 
                        command=lambda: self.resultado(self.text_pantalla,self.text_pantalla2,
                                                       self.text_pantalla3,self.text_pantalla4,self.text_pantalla5,
                                                       self.text_pantalla6,self.text_pantalla7,self.text_pantalla8,
                                                       self.text_pantalla9)).place(x = 390, y = 300);
        
        #label text
        
        label1 = Label(calculadora, text = "Resultado de la suma Diagonal =").place(x = 50, y = 150);
        
        Entrada10 = Entry(calculadora,width = 10,textvariable = self.r).place(x = 240, y = 150,height = 30);
        
        calculadora.mainloop();
#------------------------------------------------------------------------------------------------------------
    #METODOS
        
    def Click(self,a,counter):
        global operador;
        
        
        if self.counter == 1:
            self.operador2 += str(a);
            self.text_pantalla2.set(self.operador2);
            print (self.counter)
            pass
        elif self.counter == 2:
            self.operador3 += str(a);
            self.text_pantalla3.set(self.operador3);
            print (self.counter)
            pass
        elif self.counter == 3:
            self.operador4 += str(a);
            self.text_pantalla4.set(self.operador4);
            print (self.counter)
            pass
            
        elif self.counter == 4:
            self.operador5 += str(a);
            self.text_pantalla5.set(self.operador5);
            print (self.counter)
            pass
            
        elif self.counter == 5:
            self.operador6 += str(a);
            self.text_pantalla6.set(self.operador6);
            print (self.counter)
            pass
            
        elif self.counter == 6:
            self.operador7 += str(a);
            self.text_pantalla7.set(self.operador7);
            print (self.counter)
            pass
            
        elif self.counter == 7:
            self.operador8 += str(a);
            self.text_pantalla8.set(self.operador8);
            print (self.counter)
            pass
            
        elif self.counter == 8:
            self.operador9 += str(a);
            self.text_pantalla9.set(self.operador9);
            print (self.counter)
            pass
                        
        else:
            self.operador += str(a);
            self.text_pantalla.set(self.operador);
            print (self.counter)
        
        
   
        
    def Next(self,counter):
       
        
        if self.counter <= 0:
            self.Entrada1.config(state=tk.NORMAL)
            print (self.counter)
            self.Entrada9.config(state=tk.DISABLED)
            print (self.counter)
        elif self.counter == 1:
            self.Entrada1.config(state=tk.DISABLED)
            print (self.counter)
            self.Entrada2.config(state=tk.NORMAL)
            print (self.counter)
            self.Entrada9.config(state=tk.DISABLED)
            print (self.counter)
        elif self.counter == 2:
            self.Entrada2.config(state=tk.DISABLED)
            print (self.counter)
            self.Entrada3.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 3:
            self.Entrada3.config(state=tk.DISABLED)
            self.Entrada4.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 4:
            self.Entrada4.config(state=tk.DISABLED)
            self.Entrada5.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 5:
            self.Entrada5.config(state=tk.DISABLED)
            self.Entrada6.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 6:
            self.Entrada6.config(state=tk.DISABLED)
            self.Entrada7.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 7:
            self.Entrada7.config(state=tk.DISABLED)
            self.Entrada8.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 8:
            self.Entrada8.config(state=tk.DISABLED)
            self.Entrada9.config(state=tk.NORMAL)
            print (self.counter)
        elif self.counter == 9:
            self.Entrada9.config(state=tk.NORMAL)
            print (self.counter)
        else:
            self.Entrada9.config(state=tk.DISABLED)
            print (self.counter)
            
        pass
        
        
    def resultado(self,text_pantalla,text_pantalla2,text_pantalla3,text_pantalla4,text_pantalla5,text_pantalla6,
                  text_pantalla7,text_pantalla8,text_pantalla9):
        
        global operador11;
        global operador2;
        global r;
        int  = a = float(self.text_pantalla.get())
        int  = b = float(self.text_pantalla2.get())
        int  = c = float(self.text_pantalla3.get())
        int  = d = float(self.text_pantalla4.get())
        int  = e = float(self.text_pantalla5.get())
        int  = f = float(self.text_pantalla6.get())
        int  = g = float(self.text_pantalla7.get())
        int  = h = float(self.text_pantalla8.get())
        int  = i = float(self.text_pantalla9.get())
        
        list = j = [a,b,c];
        list = k = [d,e,f];
        list = l = [g,h,i];
        
        int = n = [j,k,l];
        list = a1 = 0; 
        list = a2 = 0; 
        
        print(n)
        
        
        for i,e in enumerate(n):
            print(i,e)
            if i == 0:
                a1 = [a1,e[0]];
                a2 = [a2,e[2]];
                a1 = sum(a1);
                a2 = sum(a2);
            if i == 1:
                a1 = [a1,e[1]];
                a2 = [a2,e[1]];
                a1 = sum(a1);
                a2 = sum(a2);
            if i == 2:
                a1 = [a1,e[2]];
                a2 = [a2,e[0]];
                a1 = sum(a1);
                a2 = sum(a2);
                
        self.operador11= str(abs(a1 - a2));
        self.r.set(self.operador11)
        
        print("se muestra el resutlado ",self.r);
        
#--------------------------------------------------------------------------------------------------------
        #reiniciar variables
        self.operador2 = "";
        
        self.text_pantalla.set(self.operador2);
        self.text_pantalla2.set(self.operador2);
        self.text_pantalla3.set(self.operador2);
        self.text_pantalla4.set(self.operador2);
        self.text_pantalla5.set(self.operador2);
        self.text_pantalla6.set(self.operador2);
        self.text_pantalla7.set(self.operador2);
        self.text_pantalla8.set(self.operador2);
        self.text_pantalla9.set(self.operador2);
                
        
        
            
        

#%%
#objeto para la interface dado por la libreria tkinter
calculadora = tk.Tk();

#se le agrega a la clase para dieseñar la calculadora
Diseño_Interface(calculadora);
