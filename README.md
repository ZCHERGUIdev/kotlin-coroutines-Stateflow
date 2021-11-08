# kotlin-coroutines-Stateflow


#### StateFlow is a state-holder observable flow that emits the current and new state updates to its collectors. The current state value can also be read through its value property. To update state and send it to the flow, assign a new value to the value property of the MutableStateFlow class.</br>
## StateFlow vs LiveData </br>
##### 1. StateFlow </br></br>
 fires when data update</br>
 can be in backgraound</br>
 safe call ,alwase has value</br>
 use flow operator</br>
  not aware of lifecycle</br>
##### 2. LiveData </br></br>
fires every records </br>
just in main thread </br>
not safe call </br>
a little operator</br>
aware of lifeCycle</br>


