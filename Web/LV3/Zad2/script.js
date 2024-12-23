function addTask() {
    const taskInput = document.getElementById("taskInput");
    const taskText = taskInput.value.trim();
    
    if (taskText === "") {
        alert("Unesite zadatak!");
        return;
    }

    const taskList = document.getElementById("taskList");

    const li = document.createElement("li");
    li.textContent = taskText;

    li.addEventListener("click", function () {
        li.classList.toggle("completed");
    });

    const deleteButton = document.createElement("button");
    deleteButton.textContent = "X";
    deleteButton.addEventListener("click", function (e) {
        e.stopPropagation(); 
        taskList.removeChild(li);
    });

    li.appendChild(deleteButton);

    taskList.appendChild(li);

    taskInput.value = "";
}
