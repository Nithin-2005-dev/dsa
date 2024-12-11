package Complexities.TimeComplexity;

public class Theory {
    /*
    1)what is time complexity?
    ->time complexity !=time taken
    ->this is the mathematical function that tells us how the time varies with the input size

    2)what do we need to consider when thinking about complexity?
    ->always look for worst case complexity
    ->always look at complexity for large data
    ->we don't care about actual time
    ->this is why we ignore all constants in time complexity analysis
    ->always ignore less dominating terms

    O(1)<O(log(n))<O(n)<O(nlog(n))<O(2^n)
     */

    /*
    Big O notation:-
    f(n)=O(g(n))
    limit n tends to infinite f(n)/g(n)<infinite
     */
    /*
    Big Ω notation:-
    ->it is opposite of big O notation
    words:Ω(n^3) -lower bound
    maths: limit n tends to infinity f(n)/g(n)>0
     */
    /*
    Big θ notation:-
    0<limit n tends to infinity f(n)/g(n)<infinity
     */
    /*
    little o notation:
    this is also giving upper bound
    words:it is loose upper bound
    f=o(g)
    f<g strictly lower
     */
}
