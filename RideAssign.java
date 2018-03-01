public class Ride Assign{

  public int distanceInt(int x1, int y1, int x2, int y2){
    return Math.abs(x2-x1) + Math.abs(y2-y1);
  }
  
  
  //gives int array of: bonus (0 if can't finish before latest), how far to start
  //where and when finishing already given by the ride info
  public int[] fitnessTest(int carX, int carY, int carStep, int rideX1, int rideY1, int rideX2, int rideY2, int rideBonus, int rideLatest){
        int ret[] = {
          (rideLatest >= (carStep + ret[1] + ret[0]/rideBonus))? rideBonus*distanceInt(rideX2, rideY2, rideX1, rideY1) : 0,
          distanceInt(carX, carY, rideX1, rideY1)
        };
        return ret;
  }

}
