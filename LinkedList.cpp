#include<iostream>
using namespace std;


class Node {
	public:
		int data;
		Node *next = nullptr;

		Node(int data) {
			this->data = data;
		}
};

class LinkedList
{
	
	Node *head = nullptr;
	Node *tail = nullptr;
	public:
		void insert(int data) {
			Node *temp = new Node(data);
			if(this->head == nullptr) {
				this->head = this->tail = temp;
				return;
			}
			this->tail->next = temp;
			this->tail = temp;
		}

		void display() {
			Node *temp = head;
			while(temp->next != nullptr) {
				cout << temp->data << endl;
				temp = temp->next;
			}
		}

		Node* search(int data) {
			Node *temp = head;
			while(temp -> next != nullptr) {
				if(temp-> data == data) {
					return temp;
				}
				temp = temp->next;
			}
			return nullptr;
		}
	
};

int main() {
	LinkedList *list = new LinkedList();
	list->insert(1);
	list->insert(2);
	list->insert(3);
	list->insert(4);
	list->insert(5);
	list->insert(6);
	cout << list-> search(3)->data << endl;
	list->display();
	cout << "Don't Worry I am here'" << endl;
}
