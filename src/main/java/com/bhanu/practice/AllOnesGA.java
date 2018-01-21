package com.bhanu.practice;

/**
 * Hello world!
 *
 */
public class AllOnesGA
{
    public static void main(String[] args) {
        // These two lines were already here:
        GeneticAlgorithm ga = new GeneticAlgorithm(100, 0.001, 0.95, 0);
        Population population = ga.initPopulation(20);

        // The following is the new code you should be adding:
        ga.evalPopulation(population);
        int generation = 1;

        while (ga.isTerminationConditionMet(population) == false) {
            // Print fittest individual from population
            System.out.println("Best solution: " + population.getFittest(0).toString());

            // Apply crossover
            // TODO!
            population=ga.crossoverPopulation(population);

            population =ga.mutatePopulation(population);

            // Apply mutation
            // TODO!

            // Evaluate population
            ga.evalPopulation(population);

            // Increment the current generation
            generation++;
        }

        System.out.println("Found solution in " + generation + " generations");
        System.out.println("Best solution: " + population.getFittest(0).toString());
    }




}
