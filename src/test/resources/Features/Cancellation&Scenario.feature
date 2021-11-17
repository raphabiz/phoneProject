Feature: Cancellation and scenario

  En tant que r�alisateur
  Je souhaite avoir la possibilit� de supprimer des adaptations d�un sc�nario donn�
  Afin de prendre en compte les annulations de la cr�ation des films qui ont d�coule

  Scenario Outline: suppression d'une adaptation d'un scenario
    Given un scenario qui est nomm� <origTitle>
    And le scenario comprend un film avec un <title1> et un <director1>
    And le scenario comprend un film avec un <title2> et un <director2>
    When le r�alisateur supprime une adaptation d'un scenario donn�
    Then le syst�me met � jour les informations du scenario (nombre d'adaptations du scenario: <result>).

    Examples:
      | origTitle             | title1                           | director1        | title2                    | director2           |  result |
      | "Harry Potter"        | "And Philosopher's Stone"        | "David Lynch"    | "And Hedwig"              | "Denis Villeneuve"  | 1       |
      | "Matrix"              | "Matrix"                         | "Chris Columbus" | "The end of Neo"          | "Dan Mazer"         | 1       |