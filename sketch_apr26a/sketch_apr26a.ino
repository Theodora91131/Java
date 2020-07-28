




int ledPinA = 2;
int ledPinB = 3;
int ledPinC = 4;
int ledPinD = 5;
int ledPinE = 6;
int ledPinF = 7;
int ledPinG = 8;
//定義可變電阻擲腳位
int analogPin = A0;
//可變電阻值
int analogVal = 0;
//LED顯示數字
int numLED = 0;
void setup() {
  Serial.begin(9600);
 
  for(int i = 2;i<=9;i++){
    pinMode(i, OUTPUT);  
  }
}
void loop() {
showChar(0);
  
}
void showChar(int intChar){
  switch(intChar){
    case 0:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, HIGH);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;
    
    case 1:
    digitalWrite(ledPinA, LOW);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, LOW);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, LOW);
    digitalWrite(ledPinG, LOW);
    break;

    case 2:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, LOW);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, HIGH);
    digitalWrite(ledPinF, LOW);
    digitalWrite(ledPinG, HIGH);
    break;

    case 3:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, LOW);
    digitalWrite(ledPinG, HIGH);
    break;

    case 4:
    digitalWrite(ledPinA, LOW);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, LOW);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;

    case 5:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, LOW);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;

    case 6:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, LOW);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, HIGH);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;

    case 7:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, LOW);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, LOW);
    break;

    case 8:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, HIGH);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;

    case 9:
    digitalWrite(ledPinA, HIGH);
    digitalWrite(ledPinB, HIGH);
    digitalWrite(ledPinC, HIGH);
    digitalWrite(ledPinD, HIGH);
    digitalWrite(ledPinE, LOW);
    digitalWrite(ledPinF, HIGH);
    digitalWrite(ledPinG, HIGH);
    break;
  }
}
