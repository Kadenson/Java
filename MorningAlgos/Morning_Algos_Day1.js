class SLNode {
    constructor(value) {
        this.value = value
        this.next = null
    }
}

class SLL{
    constructor(){
        this.head = null; 
    }
    printValues(){
        // 1. SLL IS EMPTY
        if(this.head === null){
            console.log("LIST IS EMPTY")
            return
        }
        // 2. SLL IS NOT EMPTY
        var runner = this.head
        while(runner.next != null){
            console.log(runner.value)
            runner = runner.next
        }
        console.log(runner.value)
    }

    insertAtBack(data){
         // 1. LIST IS EMPTY
    if(this.head === null){
        var newNode = new SLNode(data)
        this.head = newNode
        return
    }
    // 2. LIST IS NOT EMPTY
    // Set the runner at head
    var runner = this.head;
    // Have the runner go to the last Node
    while(runner.next != null){
        console.log(runner.value)
        runner = runner.next
    }
    // Create a new SLNode with the data
    var newNode = new SLNode(data)
    // Set the runner.next to the new Node created
    runner.next = newNode
    }
    
    insertAtFront(data) {
        // 1. LIST IS EMPTY
        if(this.head === null){
            // CREATE A NEW NODE
            var newNode = new SLNode(data)
            // POINT HEAD TO NEW NODE
            this.head = newNode
            return
        }
        // 2. LIST IS NOT EMPTY
        // CREATE A NEW NODE
        var newNode = new SLNode(data)
        // POINT THE NEW NODES.NEXT TO THE HEAD
        newNode.next = this.head
        // POINT THE HEAD TO THE NEW NODE
        this.head = newNode
    }

    removeAtFront(){
        // 1. LIST IS EMPTY
        if(this.head === null){
            return
        }
        // 2 . LIST IS NOT EMPTY
        // CREATE TEMP VARIABLE TO POINT TO HEAD
        var temp = this.head
        // MOVE HEAD DOWN THE LIST ONE NODE
        this.head = this.head.next
        // HAVE THE NODE TO DELETE , POINT TO NULL
        temp.next = null
        return temp.value
    }

    average(){
        //1. LIST IS EMPTY
        if(this.head === null){
            return 0
        }
        //2. LIST IS NOT EMPTY
        var count = 0
        var totalsum = 0

        var runner = this.head
        while(runner.next != null){
            count++
            totalsum += runner.value
            runner = runner.next
        }
        count++
        totalsum += runner.value 
        return totalsum / count
    }

    secondToLast(){
        //1. LIST IS EMPTY OR IF THE LIST HAS ONLY 1 NODE
        if(this.head === null || this.head.next === null){
            return false
        }
        //2. LIST IS NOT EMPTY
        var runner = this.head
        while(runner.next.next != null){
            runner = runner.next
        }
        return runner.value
    }

    removeVal(val){
        //1. LIST IS EMPTY
        if(this.head === null){
            return false
        }
        //2. LIST IS NOT EMPTY
        if(this.head.next === null && val === this.head.value){
            this.head = null
            return true
        }
        // CREATE A RUNNER
        var runner = this.head
        // HAVE THE RUNNER GO DOWN THE SLL, CHECK TO SEE IF NODES VALUE MATCHES THE VAL
        while(runner.next != null){
            if(runner.next.value === val){
                // SET A TEMP VAR TO THE NODE TO DELETE
                var temp = runner.next
                temp = null
                runner.next = runner.next.next
                return true
            }
            runner = runner.next
        }
        return false
    }
}

var newList = new SLL();

newList.insertAtFront(1)
newList.insertAtFront(2)
newList.insertAtFront(3)
newList.insertAtFront(4)
newList.removeVal(3)

newList.printValues()