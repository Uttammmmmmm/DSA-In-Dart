import 'dart:io';

void print1(int n) {
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
      stdout.write("* ");
    }
    print("\n");
  }
}

void print2(int n) {}
void main() {
  print("Enter the value of n :- ");
  int n = int.parse(stdin.readLineSync()!); // take input from user

  print1(n);
  String name = stdin.readLineSync()!;
  print(name);
}
