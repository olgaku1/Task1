package by.epamtc.OlgaKulik.task02.entity;

import by.epamtc.OlgaKulik.task02.entity.Ball;

import java.util.ArrayList;

public class Basket {
    public ArrayList<Ball> balls;
    public double weight;

    public Basket(ArrayList<Ball> balls)
    {
        if (balls == null)
            throw new NullPointerException();

        this.balls = new ArrayList<>();
        for (Ball ball: balls) {
            add(ball);
        }
    }

    public void add(Ball newBall) {
        if (newBall == null)
            throw new NullPointerException();
        this.balls.add(newBall);
        this.weight += newBall.getWeight();
    }

    public int getBlueBallsCount() {
        int numOfBlueBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.getColor().equals("Blue"))
                numOfBlueBalls++;
        }
        return numOfBlueBalls;
    }
}
