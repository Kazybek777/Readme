SELECT distinct city
from station
WHERE right(city, 1) in  ('a', 'e', 'i', 'o', 'u');