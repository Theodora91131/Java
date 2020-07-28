int ledPinA = 2;
int ledPinB = 3;
int ledPinC = 4;
int ledPinD = 5;
int ledPinE = 6;
int ledPinF = 7;
int ledPinG = 8;
// 設定紅黃綠燈Pin 值
  int LEDRed = 9;
  int LEDYellow = 10;
  int LEDGreen = 11;
//定義可變電阻擲腳位
int analogPin = A0;
//可變電阻值
int analogVal = 0;
//LED顯示數字
int numLED = 0;

void setup() {
  Serial.begin(9600);
   pinMode(LEDRed, OUTPUT);     
  pinMode(LEDYellow, OUTPUT);     
  pinMode(LEDGreen, OUTPUT);
 
  for(int i = 2;i<=9;i++){
    pinMode(i, OUTPUT);  
  }
}

void loop() {
   for(int i = 0;i<=8;i++){
    showChar(i);
    delay(1000);
  }

  digitalWrite(LEDRed, LOW);     // 綠燈
  digitalWrite(LEDYellow, LOW);
  digitalWrite(LEDGreen, HIGH);
  delay(6000);      //等待6秒鐘

  digitalWrite(LEDRed, LOW);   // 黃燈
  digitalWrite(LEDGreen, LOW);
  digitalWrite(LEDYellow, HIGH);
  delay(3000);     //等待3秒鐘

  digitalWrite(LEDYellow, LOW);
  digitalWrite(LEDGreen, LOW);
  digitalWrite(LEDRed, HIGH);   // 紅燈
  delay(8000);     //等待8秒鐘    
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
