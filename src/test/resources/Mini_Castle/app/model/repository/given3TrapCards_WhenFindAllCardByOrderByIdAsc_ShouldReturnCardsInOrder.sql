INSERT INTO card (card_id, card_name, card_type, description, score_value, card_image_path)
VALUES
(
	1,
	'Spike hole',
	'Trap',
	'A big hole in the middle of the way with pikes in it !',
	25,
	'image/trapcard.jpg'
);


INSERT INTO trapcard (trapcard_id, card_id, skill_check, damage)
VALUES
(	
	1,
	1,
	5,
	5
);

INSERT INTO card (card_id, card_name, card_type, description, score_value, card_image_path)
VALUES
(
	2,
	'Big rake',
	'Trap',
	'A rake in the middle of the way !',
	5,
	'image/trapcard.jpg'
);


INSERT INTO trapcard (trapcard_id, card_id, skill_check, damage)
VALUES
(	
	2,
	2,
	5,
	50
);

INSERT INTO card (card_id, card_name, card_type, description, score_value, card_image_path)
VALUES
(
	3,
	'Poison darts',
	'Trap',
	'Poison darts activated by a pressure plate ',
	15,
	'image/trapcard.jpg'
);

INSERT INTO trapcard (trapcard_id, card_id, skill_check, damage)
VALUES
(	
	3,
	3,
	5,
	50
);
