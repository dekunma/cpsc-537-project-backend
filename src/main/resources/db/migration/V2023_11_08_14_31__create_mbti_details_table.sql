drop table if exists mbti_details;

create table mbti_details
(
    code            varchar(4) primary key,
    label           varchar(30),
    description     varchar(512),
    first_function  varchar(2),
    second_function varchar(2),
    third_function  varchar(2),
    fourth_function varchar(2)
);

insert into mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
values ('INTJ', 'Architect', 'Imaginative and strategic thinkers, with a plan for everything.', 'Ni', 'Te', 'Fe', 'Se');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('INTP', 'Logician', 'Innovative inventors with an unquenchable thirst for knowledge.', 'Ti', 'Ne', 'Si', 'Fe');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ENTJ', 'Commander', 'Bold, imaginative and strong-willed leaders, always finding a way – or making one.', 'Te',
        'Ni', 'Se', 'Fi');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ENTP', 'Debater', 'Smart and curious thinkers who cannot resist an intellectual challenge.', 'Ne', 'Ti', 'Fe',
        'Si');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('INFJ', 'Advocate', 'Quiet and mystical, yet very inspiring and tireless idealists.', 'Ni', 'Fe', 'Ti', 'Se');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('INFP', 'Mediator', 'Poetic, kind and altruistic people, always eager to help a good cause.', 'Fi', 'Ne', 'Si',
        'Te');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ENFJ', 'Protagonist', 'Charismatic and inspiring leaders, able to mesmerize their listeners.', 'Fe', 'Ni',
        'Se', 'Ti');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ENFP', 'Campaigner',
        'Enthusiastic, creative and sociable free spirits, who can always find a reason to smile.', 'Ne', 'Fi', 'Te',
        'Si');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ISTJ', 'Logistician', 'Practical and fact-minded individuals, whose reliability cannot be doubted.', 'Si',
        'Te', 'Fi', 'Ne');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ISFJ', 'Defender', 'Very dedicated and warm protectors, always ready to defend their loved ones.', 'Si', 'Fe',
        'Ti', 'Ne');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ESTJ', 'Executive', 'Excellent administrators, unsurpassed at managing things – or people.', 'Te', 'Si', 'Ne',
        'Fi');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ESFJ', 'Consul', 'Extraordinarily caring, social and popular people, always eager to help.', 'Fe', 'Si', 'Ne',
        'Ti');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ISTP', 'Virtuoso', 'Bold and practical experimenters, masters of all kinds of tools.', 'Ti', 'Se', 'Ni', 'Fe');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ISFP', 'Adventurer', 'Flexible and charming artists, always ready to explore and experience something new.',
        'Fi', 'Se', 'Ni', 'Te');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ESTP', 'Entrepreneur', 'Smart, energetic and very perceptive people, who truly enjoy living on the edge.',
        'Se', 'Ti', 'Fe', 'Ni');
INSERT INTO mbti_details (code, label, description, first_function, second_function, third_function, fourth_function)
VALUES ('ESFP', 'Entertainer', 'Spontaneous, energetic and enthusiastic people – life is never boring around them.',
        'Se', 'Fi', 'Te', 'Ni');
