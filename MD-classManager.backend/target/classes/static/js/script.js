document.querySelectorAll(".button-edit").forEach((button) => {
    button.addEventListener("click", () => {
        const message = document.getElementById("edit-message");
        message.classList.remove("hidden");
    });
});

document.querySelector("#edit-message-buttons .message-confirm").addEventListener("click", () => {
    window.location.href = "editar.html";
});

document.querySelector("#edit-message-buttons .message-cancel").addEventListener("click", () => {
    const message = document.getElementById("edit-message");
    message.classList.add("hidden");
});

// excluir
document.querySelectorAll(".button-trash").forEach((button) => {
    button.addEventListener("click", () => {
        const deleteMessage = document.getElementById("delete-message");
        deleteMessage.classList.remove("hidden");
        window.rowToDelete = button.closest("tr");
    });
});

document.querySelector("#delete-message-buttons .message-confirm").addEventListener("click", () => {
    if (window.rowToDelete) {
        window.rowToDelete.remove();
    }
    closeDeleteMessage();
});

document.querySelector("#delete-message-buttons .message-cancel").addEventListener("click", () => {
    closeDeleteMessage();
});

function closeDeleteMessage() {
    document.getElementById("delete-message").classList.add("hidden");
};


