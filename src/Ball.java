int balls= 12;
int x
int y
cuestrength
velocity(cuestrength)
  formula to find velocity in x and y direction
  x=
  y=
impact(velocity, x,y)
  if ball = another ball
    Ball.impact()
  if ball hits wall
    Ball.impact()
  if ball speed = 0 
    next persons turn
goal (x,y)
  if ball(x,y) = goal
    balls --;
    samee persons turn again
if cue hits opponents ball
  Ball.impact()
  opponent chooses where white ball goes
if white ball goes into goal
  opponent chooses where white ball goes
