pip install --user awscli
export PATH=$PATH:$HOME/.local/bin
eval $(aws ecr get-login --region us-west-2)
docker tag waecm-bsp1:latest 313230979214.dkr.ecr.us-west-2.amazonaws.com/waecm-bsp1:latest
docker push 313230979214.dkr.ecr.us-west-2.amazonaws.com/waecm-bsp1:latest
chmod 600 EC2.pem && ssh -o StrictHostKeyChecking=no -i EC2.pem ec2-user@ec2-54-187-122-131.us-west-2.compute.amazonaws.com ./deploy.sh