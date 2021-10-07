package Program;

public class Note {
    int  noteType; // C | D | E | F | F | G | A | B
    float noteLenght;
    //int instrumentId; // The Id of the instrument of that specific note

    public Note(int type, float lenght){
        this.noteType = type;
        this.noteLenght = lenght;
    }

}
