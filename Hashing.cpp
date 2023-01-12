#include<iostream>
#include<stdio.h>
using namespace std;

class Node {
	public:
		int data;
		Node *next = nullptr;

		Node(int data) {
			this->data = data;
		}
};

class Hashing {

	public:
		Node *arr[10] = {nullptr};

		void insert(int data) {
			Node *temp = new Node(data);
			int index = data % 10;
			if(arr[index] == nullptr) {
				arr[index] = temp;
				return;
			}
			Node *travel = arr[index];
			while(travel->next != nullptr) {
				travel = travel->next;
			}
			travel->next = temp;
		}
		

		void display() {
			for(int i = 0 ; i <= 9 ; i++) {
				
				if(arr[i] == nullptr) {
					printf("%d :- null \n",i);
				}
				else {
					printf("%d :- ",i);
					Node *temp = arr[i];

					while(temp != nullptr) {
						printf("%d ",temp->data);
						temp = temp->next;
					}
					cout << endl;
				}
			}
		}
};

int main() {
	Hashing *hash = new Hashing();
	hash->insert(1);
	hash->insert(2);
	hash->insert(2);
	hash->insert(3);
	hash->insert(3);
	hash->insert(4);
	hash->insert(10);
	hash->display();
	cout << "Don't worry I am here" << endl;
}


