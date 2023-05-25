'use strict'
const headerClasses = document.querySelector('.wrapper').classList;
const headerText = document.querySelector('.new-review-header-name-text');
const buttonText = document.querySelector('.send-review-button');
const changeClass = (newClass) => {
    const lastClass = headerClasses[headerClasses.length - 1]
    if (lastClass !== 'wrapper') {
        headerClasses.remove(lastClass);
    }
    headerClasses.add(newClass);
}


const reviewButton = document.querySelector('[value="review"]');

reviewButton.addEventListener('change', () => {
    changeClass('review');
    headerText.textContent = 'Новый отзыв';
    buttonText.textContent = 'Отправить отзыв';
})


const suggestionButton = document.querySelector('[value="suggestion"]')
suggestionButton.addEventListener('change', () => {
    changeClass('suggestion');
    headerText.textContent = 'Новое предложение';
    buttonText.textContent = 'Отправить предожение';
})

const complainButton = document.querySelector('[value="complain"]')
complainButton.addEventListener('change', () => {
    changeClass('complain');
    headerText.textContent = 'Новая жалоба';
    buttonText.textContent = 'Отправить жалобу';
})