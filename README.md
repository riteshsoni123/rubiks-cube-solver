# rubiks-cube-solver
This code creates the algorithm to solve the rubik's cube


RUBIK-S
This is the code that generates algorithm to solve rubik's cube........

HOW TO USE THE CODE.......................................

1-Run the code.

2-Place the cube with the front face red and down face white.

3-Enter the color of each piece on red side and now rotate the cube clockwise along the y axis, again enter the color of each piece on the green side,and the rotate as before, in the same way enter the value for orange side and bule side, atlast come to the red side facing forward.

4-Now after entering the value of four side rotate the cube along the x axis so that yellow facing side comes front.Again enter the color of all piece.

5-Now again rotate the cube along the x axis so that white face comes front.Again enter the color of all piece.

6-Now place the cube in the same way as kept in second step.

7-Hit "start solve" button.

8-The program will generate series of algorithm(example given below) which when followed "STRICTLY", one can solve the cube.

  1-B L F' L' F2 R2 U' D2 R' L2 L' B' D D2 B R' B' F B R' U' F2 D2 R' B2 
  cross track 1     B U R' U U R' U U U L'
  cross track     U L L U' R R U' F F U B B
  f2l       F' U F F' U U F
  f2l       F U U F' L U' U' L'
  f2l       F U F' MD L U' L' MD' B U' B'
  f2l       L' U L MD MD R' U U R MD' MD' L' U L
  oll       U R U R' U' R' F R F'
  pll        U U U R U R' U' R' F R R U' R' U' R U R' F'
  last move       U U
        SOLVED
  1
MEANING OF THE ALGORITHM GIVEN BY THE CODE.....................

F=front clockwise

F'=front anticlockwise

U=up clockwise

U'=up anticlockwise

B=back clockwise

B'=back anticlockwise

D=down clockwise

D'=down anticlockwise

L=left clockwise

L'=left anticlockwise

R=right clockwise

R'=right anticlockwise

M=middle vertical clockwise

M'=middle vertical anticlockwise

MD=middle horizontal and down piece clockwise(seeing the right side)

MD'=middle horizontal and down piece anticlockwise(seeing the right side)

r=middle vertical and right piece clockwise(seeing the right side)

r'=middle vertical and right piece anticlockwise(seeing the right side)

l=middle vertical and left piece clockwise(seeing the left side)

l'=middle vertical and left piece anticlockwise(seeing the left side)

u=middle horizontal and up piece clockwise(seeing the upward side)

u'=middle horizontal and up piece anticlockwise(seeing the upward side)

x=rotate the cube clockwise along x axis(seeing the right side)

x'=rotate the cube anticlockwise along x axis(seeing the right side)

y=rotate the cube clockwise along y axis(seeing the upward side)

y'=rotate the cube anticlockwise along y axis(seeing the upward side)

..............................................................THE END.....................................................................
