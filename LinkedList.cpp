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
			Node *temp = this->head;
			while(temp->next != nullptr) {
				cout << temp->data << endl;
				temp = temp->next;
			}
		}

		Node* search(int data) {
			Node *temp = this->head;
			while(temp -> next != nullptr) {
				if(temp-> data == data) {
					return temp;
				}
				temp = temp->next;
			}
			return nullptr;
		}

		void deleteNode(int data) {
			Node *temp = this->head;
			Node *todelete = search(data);
			if(todelete == nullptr) {
				cout << "Data Not Found" << endl;
				return;
			}
			if(todelete == this->head) {
				this->head = this->head->next;
				return;
			}
			while(temp-> next != todelete) {
					temp = temp->next;
			}
			if(todelete == this->tail) {
				
				temp->next = nullptr;
				tail = temp;
				return;
			}
			temp->next = todelete->next;
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
	list->display();
	cout << endl;
	cout << endl;
	list->deleteNode(3);
	list->display();
	cout << endl;
	cout << endl;
	list->deleteNode(1);
	list->display();
	cout << endl;
	cout << endl;
	list->deleteNode(5);
	list->display();
	list->deleteNode(5);
		
	cout << "Don't Worry I am here'" << endl;
}
