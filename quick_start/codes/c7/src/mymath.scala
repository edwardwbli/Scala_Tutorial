package lib{
    package c7{
        object myMath{
            private object sqrtObject{
                def improve(guess:Double,x:Double):Double={
                        return average(guess,x/guess)
                    }
                def good_enough(guess:Double,x:Double):Boolean={
                        if (abs(improve(guess,x) - guess)<(0.001*guess)){
                            return true
                        }  else {
                            return false
                        }
                    }
                def sqrt_iter(guess:Double,x:Double):Double={
                        if (good_enough(guess,x)){
                            return guess
                        } else {
                            sqrt_iter(improve(guess,x),x)
                        }
                    }
            }

            def abs = (x:Double)=>if(x>=0) x else -x
            def average = (x:Double,y:Double)=> (x+y)/2
            def sqrt = (x:Double) => sqrtObject.sqrt_iter(1.0,x)
        }
    }
}
