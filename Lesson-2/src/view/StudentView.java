package view;

import java.util.List;

import data.User;

public class StudentView extends UserView{
 // ОБЯЗАТЕЛЬНО ДОЛЖНЫ переобозначить абстрактный класс
    @Override
    protected User findTheBest(List<User> users) {
        //здесь реализуется своя логика по нахождению лучшего в списке
        return null;
    }
    
}
