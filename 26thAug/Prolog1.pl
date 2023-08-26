% Prolog code for factorial

% Knowledge base
factorial(0,1).

% Rule base
factorial(N, F):-
    N > 0,
    N1 is N - 1,
    factorial(N1, F1),
    F is N * F1.